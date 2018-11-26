<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html lang="en">
<head>
<%@include file="../../common/includeBaseSet.jsp" %>
<%@include file="../../common/includeSystemSet.jsp" %>
</head>
<body>
	<div class="page-content">
		<div class="row-fluid">
			<div class="col-xs-12">
				<form id="baseForm" class="form-inline" method="POST" onsubmit="return false;">
				<div class="row">
					<div class="widget-main">	
						<input  type="text"  name="keyWord" placeholder="这里输入关键词" class="input-large">
						&nbsp;&nbsp;<span id="selectisValid"><label></label>：<select  data-placeholder="状态" name="isValid" class="chosen-select isSelect75"></select></span>
						&nbsp;&nbsp;<span id="selectisValid1"><label></label>：<select  data-placeholder="型号" name="isValid1" class="chosen-select isSelect75"></select></span>
						&nbsp;&nbsp;<button id='searchBtn' class="btn btn-warning  btn-xs" title="过滤" type="button" onclick="getbaseList(1)"><i class="icon-search bigger-110 icon-only"></i></button>
					</div>
				</div>
				<input type='hidden' class='pageNum' name='pageNum' value='1'/>
				<input type='hidden' class='pageSize'  name='pageSize' value='25'/>
				</form>
				<table id="baseTable" class="table table-striped table-bordered table-hover" >
					<thead>
						<tr>
							<th style="width:3%" class="center">
								<label><input type="checkbox" class="ace" ><span class="lbl"></span></label>
							</th>
							<th style="width:5%" class="center hidden-80">序号</th>
							<th style="width:8%" class="center hidden-480">型号</th>
							<th style="width:4%" class="center hidden-480">设备名称</th>
							<th style="width:10%" class="center">设备ID</th>
							<th style="width:8%" class="center " >用户ID</th>
							<th style="width:4%" class="center hidden-480" >开锁消息</th>
							<th style="width:4%" class="center hidden-480" >劫持消息</th>
							<th style="width:4%" class="center hidden-480" >警报消息</th>
							<th style="width:4%" class="center hidden-480" >电量低</th>
							<!-- <th style="width:8%" class="center hidden-480" >推送key</th> -->
							<th style="width:4%" class="center hidden-480" >推送商家</th>
							<th style="width:5%" class="center hidden-480" >语言</th>
							<th style="width:10%" class="center hidden-480" >创建时间</th>
							<th style="width:10%" class="center hidden-480" >修改时间</th>
							<th style="width:6%" class="center hidden-480" >备注</th>
							<th style="width:10%" class="center">操作</th>
						</tr>
					</thead> 
					<tbody></tbody>
				</table>
				<div class="row">
					<div class="col-sm-4">
						<div class="dataTables_info customBtn" >
							<c:forEach var="pbtn" items="${permitBtn}">
								<a href="#" title="${pbtn.name}" id="${pbtn.btnId}" class="lrspace3" ><i class='${pbtn.icon} bigger-220'></i></a>
							</c:forEach>
						</div>
				</div>
					<div class="col-sm-8">
						<!--设置分页位置-->
						<div id="pageing" class="dataTables_paginate paging_bootstrap">
							<ul class="pagination"></ul>
						</div>
					</div>
				</div>
			<!-- #addorUpdateFrom -->
			<%@include file="form.jsp" %>
			<!-- #dialog-confirm -->
			<%@include file="../../common/dialog.jsp" %>
			</div>
		</div>
	</div>
<script src="${jypath}/static/js/system/user/userdevice.js"></script>
</body>
</html>