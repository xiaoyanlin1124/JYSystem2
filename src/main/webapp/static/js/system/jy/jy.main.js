var JY = JY || {};
$(function() {
	$('table th input:checkbox').on('click', function() {
		var a = this;
		$(this).closest('table').find('tr > td:first-child input:checkbox').each(function() {
			this.checked = a.checked;
			$(this).closest('tr').toggleClass('selected')
		})
	});
	$(".isValidCheckbox [sh-isValid]").bind('click', function() {
		$(".isValidCheckbox [hi-isValid]").val((this.checked) ? "1" : "0")
	});
	$.widget("ui.dialog", $.extend({}, $.ui.dialog.prototype, {
		_title: function(a) {
			var b = this.options.title || '&nbsp;';
			if (("title_html" in this.options) && (this.options.title_html == true)) a.html(b);
			else a.text(b)
		}
	}))
});
JY = {
	Object: {
		notNull: function(a) {
			if (a === null) return false;
			else if (a === undefined) return false;
			else if (a === "undefined") return false;
			else if (a === "") return false;
			else if (a === "[]") return false;
			else if (a === "{}") return false;
			else return true
		},
		notEmpty: function(a) {
			if (a === null) return "";
			else if (a === undefined) return "";
			else if (a === "undefined") return "";
			else if (a === "") return "";
			else if (a === "[]") return "";
			else if (a === "{}") return "";
			else return a
		},
		serialize: function(b) {
			var o = {};
			$.each(b.serializeArray(), function(a) {
				if (o[this['name']]) {
					o[this['name']] = o[this['name']] + "," + this['value']
				} else {
					o[this['name']] = this['value']
				}
			});
			return o
		},
		comVar: function(a) {
			var b = "",
				values = "",
				types = "",
				vars = {};
			if (a) {
				$.each(a, function() {
					if (b != "") {
						b += ",";
						values += ",";
						types += ","
					}
					b += this.key;
					values += this.value;
					types += this.type
				})
			}
			vars = {
				keys: b,
				values: values,
				types: types
			};
			return vars
		}
	},
	Dict: {
		setSelect: function(h, j, k, l) {
			$.ajax({
				type: 'POST',
				url: jypath + '/backstage/dataDict/getDictSelect',
				data: {
					ids: h,
					keys: j
				},
				dataType: 'json',
				success: function(a, b) {
					if (a.res == 1) {
						var c = a.obj;
						var d = h.split(",");
						var e = "",
							g = "";
						if (k == 1) {
							for (var i = 0; i < d.length; i++) {
								g = c[d[i]].name;
								e = "<option value=''>请选择</option>";
								$.each(c[d[i]].items, function(n, v) {
									e += "<option value='" + v.value + "'>" + v.name + "</option>"
								});
								$("#" + d[i] + " select").append(e);
								$("#" + d[i]).trigger("liszt:updated")
							}
						} else if (k == 2) {
							var f = l.split(",");
							for (var i = 0; i < d.length; i++) {
								g = c[d[i]].name;
								$("#" + d[i] + " label").html(g);
								e = "<option value=''>" + f + "</option>";
								$.each(c[d[i]].items, function(n, v) {
									e += "<option value='" + v.value + "'>" + v.name + "</option>"
								});
								$("#" + d[i] + " select").append(e)
							}
						} else {
							for (var i = 0; i < d.length; i++) {
								var g = c[d[i]].name;
								$("#" + d[i] + " label").html(g);
								e = "";
								$.each(c[d[i]].items, function(n, v) {
									e += "<option value='" + v.value + "'>" + v.name + "</option>"
								});
								$("#" + d[i] + " select").append(e)
							}
						}
					}
					if ("ontouchend" in document) {
						$(".chosen-select").removeClass("chosen-select")
					} else {
						$(".chosen-select").chosen();
						$(".chosen-select-deselect").chosen({
							allow_single_deselect: true
						})
					}
				}
			})
		}
	},
	Page: {
		jump: function(a, b, c) {
			$("#" + a + " .pageNum").val(b);
			eval(c + "()")
		},
		setSize: function(a, b, c) {
			$("#" + a + " .pageNum").val(1);
			$("#" + a + " .pageSize").val(b);
			eval(c + "()")
		},
		jumpCustom: function(a, b, c, d) {
			var e = $("#" + b + " .choseJPage").val();
			if (typeof(e) == "undefined") return;
			else if (e == 0) e = 1;
			else if (e > c) e = c;
			$("#" + a + " .pageNum").val(e);
			eval(d + "()")
		},
		setPage: function(a, b, c, d, e, f) {
			if (e > 0) {
				var g = $("#" + b + " ul"),
					html = "";
				g.empty();
				var h = parseInt((e - 1) / c) + 1;
				if (d - 1 >= 1) {
					html += "<li class='prev'><a onclick='JY.Page.jump(&apos;" + a + "&apos;,1,&apos;" + f + "&apos;)' href='#'>首页</a></li>";
					html += "<li class='prev'><a onclick='JY.Page.jump(&apos;" + a + "&apos;," + (d - 1) + ",&apos;" + f + "&apos;)' href='#'>上页</a></li>"
				} else {
					html += "<li class='prev disabled'><a href='##'>首页</a></li>";
					html += "<li class='prev disabled'><a href='##'>上页</a></li>"
				}
				var i = h > 2 ? 2 : h;
				var j = 1;
				var k = d - parseInt(i / 2);
				if (k > 1) j = k;
				var l = j + i;
				if (l > h) {
					l = h;
					j = h > i ? (h - i) : 1
				}
				if (d > 2 && h > 3) {
					html += "<li class='' ><a href='#' onclick='JY.Page.jump(&apos;" + a + "&apos;," + (d - 2) + ",&apos;" + f + "&apos;)' >..</a></li>"
				}
				for (var m = j; m <= l; m++) {
					var n = (parseInt(m));
					if (d == n) {
						html += "<li class='active' ><a href='#'>" + n + "</a></li>"
					} else {
						html += "<li><a onclick='JY.Page.jump(&apos;" + a + "&apos;," + m + ",&apos;" + f + "&apos;)' href='#'>" + n + "</a></li>"
					}
				}
				if (d <= (h - 2) && h > 3) {
					html += "<li class='' ><a href='#' onclick='JY.Page.jump(&apos;" + a + "&apos;," + (d + 2) + ",&apos;" + f + "&apos;)' >..</a></li>"
				}
				if (d + 1 <= h) {
					html += "<li class='next'><a onclick='JY.Page.jump(&apos;" + a + "&apos;," + (d + 1) + ",&apos;" + f + "&apos;)' href='#'>下页</a></li>";
					html += "<li class='next'><a onclick='JY.Page.jump(&apos;" + a + "&apos;," + h + ",&apos;" + f + "&apos;)' href='#'>尾页</a></li>"
				} else {
					html += "<li class='next disabled'><a href='##'>下页</a></li>";
					html += "<li class='next disabled'><a href='##'>尾页</i></a></li>"
				}
				html += "<li class='disabled'><a href='##'>共" + h + "页<font color='red'>" + e + "</font>条</a></li>";
				html += "<li class='next'><input onkeyup='this.value=this.value.replace(/\D/g,&apos;&apos;)' type='number' min='1' max='" + h + "'  placeholder='页码' class='choseJPage' ></li>";
				html += "<li ><a class='btn btn-mini btn-success' onclick='JY.Page.jumpCustom(&apos;" + a + "&apos;,&apos;" + b + "&apos;," + h + ",&apos;" + f + "&apos;);' href='##'>跳转</a></li>";
				if (c == 25 || c == 50 || c == 100) {
					html += "<li class='disabled'><select onchange='JY.Page.setSize(&apos;" + a + "&apos;,this.value,&apos;" + f + "&apos;)' style='width:55px;float:left;' title='显示条数'>";
					html += "<option value='25'  " + ((c == 25) ? "selected='selected'" : "") + " >25</option>" + "<option value='50' " + ((c == 50) ? "selected='selected'" : "") + " >50</option>" + "<option value='100' " + ((c == 100) ? "selected='selected'" : "") + " >100</option>";
					html += "</li>"
				}
				g.append(html)
			}
		},
		setSimPage: function(a, b, c, d, e, f) {
			if (e > 0) {
				var g = $("#" + b + " ul"),
					html = "";
				g.empty();
				var h = parseInt((e - 1) / c) + 1;
				if (d - 1 >= 1) {
					html += "<li class='prev'><a onclick='JY.Page.jump(&apos;" + a + "&apos;,1,&apos;" + f + "&apos;)' href='#'>首</a></li>"
				} else {
					html += "<li class='prev disabled'><a href='##'>首</a></li>"
				}
				var i = h > 2 ? 2 : h;
				var j = 1;
				var k = d - parseInt(i / 2);
				if (k > 1) j = k;
				var l = j + i;
				if (l > h) {
					l = h;
					j = h > i ? (h - i) : 1
				}
				if (d > 2 && h > 3) {
					html += "<li class='' ><a href='#' onclick='JY.Page.jump(&apos;" + a + "&apos;," + (d - 2) + ",&apos;" + f + "&apos;)' >..</a></li>"
				}
				for (var m = j; m <= l; m++) {
					var n = (parseInt(m));
					if (d == n) {
						html += "<li class='active' ><a href='#'>" + n + "</a></li>"
					} else {
						html += "<li><a onclick='JY.Page.jump(&apos;" + a + "&apos;," + m + ",&apos;" + f + "&apos;)' href='#'>" + n + "</a></li>"
					}
				}
				if (d <= (h - 2) && h > 3) {
					html += "<li class='' ><a href='#' onclick='JY.Page.jump(&apos;" + a + "&apos;," + (d + 2) + ",&apos;" + f + "&apos;)' >..</a></li>"
				}
				if (d + 1 <= h) {
					html += "<li class='next'><a onclick='JY.Page.jump(&apos;" + a + "&apos;," + h + ",&apos;" + f + "&apos;)' href='#'>尾</a></li>"
				} else {
					html += "<li class='next disabled'><a href='##'>尾</i></a></li>"
				}
				html += "<li class='disabled'><a href='##'>共" + h + "页</a></li>";
				g.append(html)
			}
		}
	},
	Tags: {
		cleanForm: function(a) {
			$("#" + a + " input[type$='text']").val("");
			$("#" + a + " textarea").val("")
		},
		setFunction: function(a, b) {
			var h = "";
			if (b != null && b.length > 0) {
				h += "<td class='center'>";
				h += "<div class='visible-md visible-lg hidden-sm hidden-xs btn-group'>";
				for (var i = 0; i < b.length; i++) {
					h += "<a href='#' title='" + JY.Object.notEmpty(b[i].name) + "' onclick='" + JY.Object.notEmpty(b[i].btnFun) + "(&apos;" + a + "&apos;)' class='aBtnNoTD' ><i class='" + b[i].icon + " bigger-140'></i></a>"
				}
				h += "</div>";
				h += "<div class='visible-xs visible-sm hidden-md hidden-lg'><div class='inline position-relative'>";
				h += "<button class='btn btn-minier btn-primary dropdown-toggle' data-toggle='dropdown'><i class='icon-cog icon-only bigger-110'></i></button>";
				h += "<ul class='dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close'>";
				for (var i = 0; i < b.length; i++) {
					h += "<li><a href='#' title='" + JY.Object.notEmpty(b[i].name) + "' onclick='" + JY.Object.notEmpty(b[i].btnFun) + "(&apos;" + a + "&apos;)' class='aBtnNoTD' ><i class='" + b[i].icon + " bigger-140'></i></a></li>"
				}
				h += "</ul></div></div>";
				h += "</td>"
			} else {
				h += "<td></td>"
			}
			return h
		},
		isValid: function(a, b) {
			$("#" + a + " .isValidCheckbox [hi-isValid]").val(b);
			if (b == 1) {
				$("#" + a + " .isValidCheckbox [sh-isValid]").prop("checked", true)
			} else {
				$("#" + a + " .isValidCheckbox [sh-isValid]").prop("checked", false)
			}
		}
	},
	Model: {
		loading: function(a) {
			if (JY.Object.notNull(a)) $("#jyLoadingStr").empty().append(a);
			else $("#jyLoadingStr").empty().append("数据读取中...");
			$("#jyLoading").removeClass('hide').dialog({
				dialogClass: "loading-no-close",
				minHeight: 50,
				resizable: false,
				modal: true,
				show: {
					effect: "fade"
				},
				hide: {
					effect: "fade"
				}
			})
		},
		loadingClose: function() {
			$("#jyLoading").dialog("close")
		},
		confirm: function(a, b) {
			$("#jyConfirmStr").empty();
			if (JY.Object.notNull(a)) $("#jyConfirmStr").append(a);
			else $("#jyConfirmStr").append("确认吗？");
			$("#jyConfirm").removeClass('hide').dialog({
				resizable: false,
				modal: true,
				title: "<div class='widget-header'><h4 class='font-bold'>询问</h4></div>",
				title_html: true,
				show: {
					effect: "explode",
					pieces: 9
				},
				hide: {
					effect: "explode",
					pieces: 9
				},
				buttons: [{
					html: "<i class='icon-ok bigger-110'></i>&nbsp;确认",
					"class": "btn btn-primary btn-xs",
					click: function() {
						$(this).dialog("close");
						if (typeof(b) == 'function') {
							b.call(this)
						}
					}
				}, {
					html: "<i class='icon-remove bigger-110'></i>&nbsp;取消",
					"class": "btn btn-xs",
					click: function() {
						$(this).dialog("close")
					}
				}]
			})
		},
		info: function(a, b) {
			if (JY.Object.notNull(a)) {
				$("#jyInfoStr").empty().append(a);
				$("#jyInfo").removeClass('hide').dialog({
					resizable: false,
					dialogClass: "title-no-close",
					modal: true,
					title: "<div class='widget-header'><h4 class='font-bold'>提示</h4></div>",
					title_html: true,
					show: {
						effect: "explode",
						pieces: 9
					},
					hide: {
						effect: "explode",
						pieces: 9
					},
					buttons: [{
						html: "<i class='icon-ok bigger-110'></i>&nbsp;确认",
						"class": "btn btn-primary btn-xs",
						click: function() {
							$(this).dialog("close");
							if (typeof(b) == 'function') {
								b.call(this)
							}
						}
					}]
				})
			}
		},
		error: function(a) {
			if (JY.Object.notNull(a)) {
				$("#jyErrorStr").empty().append(a);
				$("#jyError").removeClass('hide').dialog({
					resizable: false,
					dialogClass: "title-no-close",
					modal: true,
					title: "<div class='widget-header'><h4 class='font-bold red'>错误</h4></div>",
					title_html: true,
					show: {
						effect: "shake",
						duration: 100
					},
					hide: {
						effect: "explode"
					},
					buttons: [{
						html: "<i class='icon-ok bigger-110'></i>&nbsp;确认",
						"class": "btn btn-primary btn-xs",
						click: function() {
							$(this).dialog("close")
						}
					}]
				})
			}
		},
		check: function(a, b, c) {
			$("#" + a).removeClass('hide').dialog({
				resizable: false,
				modal: true,
				title: "<div class='widget-header'><h4 class='smaller'>" + (JY.Object.notNull(b) ? b : "查看") + "</h4></div>",
				title_html: true,
				buttons: [{
					html: "<i class='icon-remove bigger-110'></i>&nbsp;取消",
					"class": "btn btn-xs",
					click: function() {
						$(this).dialog("close");
						if (typeof(c) == 'function') {
							c.call(this)
						}
					}
				}]
			})
		},
		checkWidth: function(a, b, c, d) {
			$("#" + b).removeClass('hide').dialog({
				width: a,
				resizable: false,
				modal: true,
				title: "<div class='widget-header'><h4 class='smaller'>" + (JY.Object.notNull(c) ? c : "查看") + "</h4></div>",
				title_html: true,
				buttons: [{
					html: "<i class='icon-remove bigger-110'></i>&nbsp;取消",
					"class": "btn btn-xs",
					click: function() {
						$(this).dialog("close");
						if (typeof(d) == 'function') {
							d.call(this)
						}
					}
				}]
			})
		},
		edit: function(a, b, c, d) {
			$("#" + a).removeClass('hide').dialog({
				resizable: false,
				modal: true,
				title: "<div class='widget-header'><h4 class='smaller'>" + (JY.Object.notNull(b) ? b : "修改") + "</h4></div>",
				title_html: true,
				buttons: [{
					html: "<i class='icon-ok bigger-110'></i>&nbsp;保存",
					"class": "btn btn-primary btn-xs",
					click: function() {
						if (typeof(c) == 'function') {
							JY.Model.banBtn();
							c.call(this)
						}
					}
				}, {
					html: "<i class='icon-remove bigger-110'></i>&nbsp;取消",
					"class": "btn btn-xs",
					click: function() {
						$(this).dialog("close");
						if (typeof(d) == 'function') {
							d.call(this)
						}
					}
				}]
			})
		},
		editWidth: function(a, b, c, d, e) {
			$("#" + b).removeClass('hide').dialog({
				width: a,
				resizable: false,
				modal: true,
				title: "<div class='widget-header'><h4 class='smaller'>" + (JY.Object.notNull(c) ? c : "修改") + "</h4></div>",
				title_html: true,
				buttons: [{
					html: "<i class='icon-ok bigger-110'></i>&nbsp;保存",
					"class": "btn btn-primary btn-xs",
					click: function() {
						if (typeof(d) == 'function') {
							JY.Model.banBtn();
							d.call(this)
						}
					}
				}, {
					html: "<i class='icon-remove bigger-110'></i>&nbsp;取消",
					"class": "btn btn-xs",
					click: function() {
						$(this).dialog("close");
						if (typeof(e) == 'function') {
							e.call(this)
						}
					}
				}]
			})
		},
		audit: function(a, b, c, d, e) {
			$("#" + a).removeClass('hide').dialog({
				resizable: false,
				modal: true,
				title: "<div class='widget-header'><h4 class='smaller'>" + (JY.Object.notNull(b) ? b : "审核") + "</h4></div>",
				title_html: true,
				buttons: [{
					html: "<i class='icon-ok bigger-110'></i>&nbsp;同意",
					"class": "btn btn-primary btn-xs",
					click: function() {
						if (typeof(c) == 'function') {
							JY.Model.banBtn();
							c.call(this)
						}
					}
				}, {
					html: "<i class='icon-undo bigger-110'></i>&nbsp;驳回",
					"class": "btn btn-danger btn-xs",
					click: function() {
						if (typeof(d) == 'function') {
							JY.Model.banBtn();
							d.call(this)
						}
					}
				}, {
					html: "<i class='icon-remove bigger-110'></i>&nbsp;取消",
					"class": "btn btn-xs",
					click: function() {
						$(this).dialog("close");
						if (typeof(e) == 'function') {
							e.call(this)
						}
					}
				}]
			})
		},
		auditWidth: function(a, b, c, d, e, f) {
			$("#" + b).removeClass('hide').dialog({
				width: a,
				resizable: false,
				modal: true,
				title: "<div class='widget-header'><h4 class='smaller'>" + (JY.Object.notNull(c) ? c : "审核") + "</h4></div>",
				title_html: true,
				buttons: [{
					html: "<i class='icon-ok bigger-110'></i>&nbsp;同意",
					"class": "btn btn-primary btn-xs",
					click: function() {
						if (typeof(d) == 'function') {
							JY.Model.banBtn();
							d.call(this)
						}
					}
				}, {
					html: "<i class='icon-undo bigger-110'></i>&nbsp;驳回",
					"class": "btn btn-danger btn-xs",
					click: function() {
						if (typeof(e) == 'function') {
							JY.Model.banBtn();
							e.call(this)
						}
					}
				}, {
					html: "<i class='icon-remove bigger-110'></i>&nbsp;取消",
					"class": "btn btn-xs",
					click: function() {
						$(this).dialog("close");
						if (typeof(f) == 'function') {
							f.call(this)
						}
					}
				}]
			})
		},
		adjust: function(a, b, c, d, e) {
			$("#" + a).removeClass('hide').dialog({
				resizable: false,
				modal: true,
				title: "<div class='widget-header'><h4 class='smaller'>" + (JY.Object.notNull(b) ? b : "调整") + "</h4></div>",
				title_html: true,
				buttons: [{
					html: "<i class='icon-ok bigger-110'></i>&nbsp;提交",
					"class": "btn btn-primary btn-xs",
					click: function() {
						if (typeof(c) == 'function') {
							JY.Model.banBtn();
							c.call(this)
						}
					}
				}, {
					html: "<i class='icon-flag-alt bigger-110'></i>&nbsp;放弃",
					"class": "btn btn-danger btn-xs",
					click: function() {
						if (typeof(d) == 'function') {
							JY.Model.banBtn();
							d.call(this)
						}
					}
				}, {
					html: "<i class='icon-remove bigger-110'></i>&nbsp;取消",
					"class": "btn btn-xs",
					click: function() {
						$(this).dialog("close");
						if (typeof(e) == 'function') {
							e.call(this)
						}
					}
				}]
			})
		},
		adjustWidth: function(a, b, c, d, e, f) {
			$("#" + b).removeClass('hide').dialog({
				width: a,
				resizable: false,
				modal: true,
				title: "<div class='widget-header'><h4 class='smaller'>" + (JY.Object.notNull(c) ? c : "调整") + "</h4></div>",
				title_html: true,
				buttons: [{
					html: "<i class='icon-ok bigger-110'></i>&nbsp;提交",
					"class": "btn btn-primary btn-xs",
					click: function() {
						if (typeof(d) == 'function') {
							JY.Model.banBtn();
							d.call(this)
						}
					}
				}, {
					html: "<i class='icon-flag-alt bigger-110'></i>&nbsp;放弃",
					"class": "btn btn-danger btn-xs",
					click: function() {
						if (typeof(e) == 'function') {
							JY.Model.banBtn();
							e.call(this)
						}
					}
				}, {
					html: "<i class='icon-remove bigger-110'></i>&nbsp;取消",
					"class": "btn btn-xs",
					click: function() {
						$(this).dialog("close");
						if (typeof(f) == 'function') {
							f.call(this)
						}
					}
				}]
			})
		},
		banBtn: function() {
			$('.ui-dialog-buttonset button').addClass('disabled');
			setTimeout(function() {
				$('.ui-dialog-buttonset button').removeClass("disabled")
			}, 3000)
		}
	},
	Validate: {
		isEnNum: function(a) {
			if (/^[0-9a-zA-Z]+$/.test(a)) return true;
			return false
		},
		isEn: function(a) {
			if (/^[A-Za-z]+$/.test(a)) return true;
			return false
		},
		isEmail: function(a) {
			if (/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(a)) return true;
			return false
		},
		isDate: function(a) {
			if (a.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/)) return true;
			return false
		},
		isDatetime: function(a) {
			if (a.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2}) (\d{1,2}):(\d{1,2}):(\d{1,2})$/)) return true;
			return false
		},
		isUrl: function(a) {
			if (/http(s)?:\/\/([\w-]+\.)+[\w-]+(\/[\w- .\/?%&=]*)?/.test(a)) return true;
			return false
		},
		numrange: function(v, a, b) {
			v = parseInt(v);
			a = parseInt(a);
			b = parseInt(b);
			if ((a < v) && (v < b)) return true;
			return false
		},
		numrangeth: function(v, a, b) {
			v = parseInt(v);
			a = parseInt(a);
			b = parseInt(b);
			if ((a <= v) && (v <= b)) return true;
			return false
		},
		form: function(e, f) {
			var g = true;
			f = JY.Object.notNull(f) ? f : 1;
			$('#' + e + " input[jyValidate]").each(function() {
				if (g == false) return;
				var c = $(this);
				var d = $(this).attr("jyValidate").split(",");
				$.each(d, function(n, v) {
					if (g == false) return;
					if (v == 'required') {
						if (!JY.Object.notNull(c.val())) {
							c.tips({
								side: f,
								msg: "必要字段！",
								bg: '#FF2D2D',
								time: 1
							});
							c.focus();
							g = false
						}
					} else if (v == 'email') {
						if (JY.Object.notNull(c.val())) {
							if (!JY.Validate.isEmail(c.val())) {
								c.tips({
									side: f,
									msg: "电子邮箱不正确！",
									bg: '#FF2D2D',
									time: 1
								});
								c.focus();
								g = false
							}
						}
					} else if (v == 'date') {
						if (JY.Object.notNull(c.val())) {
							if (!JY.Validate.isDate(c.val())) {
								c.tips({
									side: f,
									msg: "日期格式不正确！",
									bg: '#FF2D2D',
									time: 1
								});
								c.focus();
								g = false
							}
						}
					} else if (v == 'datetime') {
						if (JY.Object.notNull(c.val())) {
							if (!JY.Validate.isDatetime(c.val())) {
								c.tips({
									side: f,
									msg: "日期时间格式不正确！",
									bg: '#FF2D2D',
									time: 1
								});
								c.focus();
								g = false
							}
						}
					} else if (v == 'numrange') {
						if (JY.Object.notNull(c.val())) {
							var a = c.attr("min");
							var b = c.attr("max");
							if (!JY.Validate.numrange(c.val(), a, b)) {
								c.tips({
									side: f,
									msg: "数字范围：" + a + "~" + b,
									bg: '#FF2D2D',
									time: 1
								});
								c.focus();
								g = false
							}
						}
					} else if (v == 'numrangeth') {
						if (JY.Object.notNull(c.val())) {
							var a = c.attr("min");
							var b = c.attr("max");
							if (!JY.Validate.numrangeth(c.val(), a, b)) {
								c.tips({
									side: f,
									msg: "数字范围：" + a + "~" + b,
									bg: '#FF2D2D',
									time: 1
								});
								c.focus();
								g = false
							}
						}
					} else if (v == 'en') {
						if (JY.Object.notNull(c.val())) {
							if (!JY.Validate.isEn(c.val())) {
								c.tips({
									side: f,
									msg: "只能输入英文",
									bg: '#FF2D2D',
									time: 1
								});
								c.focus();
								g = false
							}
						}
					} else if (v == 'ennum') {
						if (JY.Object.notNull(c.val())) {
							if (!JY.Validate.isEnNum(c.val())) {
								c.tips({
									side: f,
									msg: "只能输入英文或数字",
									bg: '#FF2D2D',
									time: 1
								});
								c.focus();
								g = false
							}
						}
					}
				})
			});
			return g
		}
	},
	Date: {
		Default: function(a) {
			return JY.Object.notNull(a) ? (new Date(a).Format("yyyy-MM-dd  hh:mm:ss")) : " "
		},
		Format: function(a, b) {
			return JY.Object.notNull(a) ? (new Date(a).Format(b)) : ""
		}
	},
	Url: {
		getParam: function(a) {
			var b = new RegExp("(^|&)" + a + "=([^&]*)(&|$)");
			var r = window.location.search.substr(1).match(b);
			if (r != null) return unescape(r[2]);
			return ""
		}
	},
	Ajax: {
		doRequest: function(c, d, e, f) {
			var g = c || e || {};
			if (typeof c == 'string') {
				g = $.extend(e || {}, JY.Object.serialize($("#" + c)), {
					menu: JY.Url.getParam("menu")
				})
			}
			$.ajax({
				type: 'POST',
				url: d,
				data: g,
				dataType: 'json',
				success: function(a, b) {
					if (a.res == 1) {
						if (typeof(f) == 'function') {
							f.call(this, a)
						}
					} else {
						if (JY.Object.notNull(a.resMsg)) JY.Model.error(a.resMsg)
					}
				},
				error: function() {
					return
				},
				beforeSend: function() {},
				complete: function() {}
			})
		},
		req: function(c, d, e, f) {
			var g = c || e || {};
			if (typeof c == 'string') {
				g = $.extend(e || {}, JY.Object.serialize($("#" + c)), {
					menu: JY.Url.getParam("menu")
				})
			}
			$.ajax({
				type: 'POST',
				url: d,
				data: g,
				dataType: 'json',
				success: function(a, b) {
					if (typeof(f) == 'function') {
						f.call(this, a)
					}
				},
				error: function() {
					return
				},
				beforeSend: function() {},
				complete: function() {}
			})
		}
	},
	File: {
		fileType: function(a, b) {
			if (JY.Object.notNull(b)) {
				var c = a.value.substr(a.value.lastIndexOf(".") + 1).toLowerCase();
				var d = b.split("|");
				for (f in d) {
					if (d[f] == c) {
						return
					}
				}
				$(a).tips({
					side: 3,
					msg: '请上传' + b + '格式的文件',
					bg: '#FF2D2D',
					time: 3
				});
				$(a).val('')
			}
		}
	}
};
Date.prototype.Format = function(a) {
	var o = {
		"M+": this.getMonth() + 1,
		"d+": this.getDate(),
		"h+": this.getHours(),
		"m+": this.getMinutes(),
		"s+": this.getSeconds(),
		"q+": Math.floor((this.getMonth() + 3) / 3),
		"S": this.getMilliseconds()
	};
	if (/(y+)/.test(a)) a = a.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	for (var k in o) {
		if (new RegExp("(" + k + ")").test(a)) a = a.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)))
	}
	return a
};