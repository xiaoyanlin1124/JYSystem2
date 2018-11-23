<%@ page contentType="text/html;charset=UTF-8" %>
<div id="auDiv" class="hide">
		<form id="auForm" method="POST" onsubmit="return false;" >
			<table cellspacing="0" cellpadding="0" border="0" class="customTable">
				<tbody>
					<tr style="display:none">
						<td colspan="2" class="ui-state-error"><input type="hidden" name="id" ></td>
					</tr>
					<tr class="FormData">
						<td class="CaptionTD"><font color="red">*</font>设备ID：</td>
						<td class="DataTD">&nbsp;
						<input type="text" jyValidate="required" role="textbox" maxlength="64" name="deviceId" class="FormElement ui-widget-content ui-corner-all"></td>
					</tr>
					<tr class="FormData">
						<td class="CaptionTD"><font color="red">*</font>设备型号：</td>
						<td class="DataTD">&nbsp;
						<input type="text" jyValidate="required" role="textbox" maxlength="32" name=deviceModel class="FormElement ui-widget-content ui-corner-all"></td>
					</tr>
					<!-- 
					<tr class="FormData">
						<td class="CaptionTD"><font color="red">*</font>模块ID：</td>
						<td class="DataTD">&nbsp;
						<input type="text" jyValidate="required" role="textbox" maxlength="32" name="moduleId" class="FormElement ui-widget-content ui-corner-all"></td>
					</tr>
					 -->
					<tr rowpos="4" class="FormData" >
						<td class="CaptionTD">状态：</td>
						<td class="DataTD">&nbsp;
							<label class="inline isValidCheckbox">
								<input type="checkbox" checked="checked" sh-isValid="" role="checkbox" class="FormElement ace ace-switch ace-switch-5" />	
								<span  class="lbl"></span>
								<!-- cb-isValid和Yes和No选择框配套使用-->
								<input type="hidden" hi-isValid=""  name="isValid" value="1" />
							</label>
						</td>
					</tr>
					<!-- 
					<tr rowpos="4" class="FormData" >
						<td class="CaptionTD">开锁消息：</td>
						<td class="DataTD">&nbsp;
							<label class="inline isValidCheckbox">
								<input type="checkbox" checked="checked" sh-isValid="" role="checkbox" class="FormElement ace ace-switch ace-switch-5" />	
								<span  class="lbl"></span>
								<input type="hidden" hi-isValid=""  name="lockOnPush" value="1" />
							</label>
						</td>
					</tr>
					<tr rowpos="4" class="FormData" >
						<td class="CaptionTD">警报消息：</td>
						<td class="DataTD">&nbsp;
							<label class="inline isValidCheckbox">
								<input type="checkbox" checked="checked" sh-isValid="" role="checkbox" class="FormElement ace ace-switch ace-switch-5" />	
								<span  class="lbl"></span>
								<input type="hidden" hi-isValid=""  name="alarmPush" value="1" />
							</label>
						</td>
					</tr>
					<tr rowpos="4" class="FormData" >
						<td class="CaptionTD">电量低：</td>
						<td class="DataTD">&nbsp;
							<label class="inline isValidCheckbox">
								<input type="checkbox" checked="checked" sh-isValid="" role="checkbox" class="FormElement ace ace-switch ace-switch-5" />	
								<span  class="lbl"></span>
								<input type="hidden" hi-isValid=""  name="powerLowPush" value="1" />
							</label>
						</td>
					</tr>
					<tr rowpos="4" class="FormData" >
						<td class="CaptionTD">劫持消息：</td>
						<td class="DataTD">&nbsp;
							<label class="inline isValidCheckbox">
								<input type="checkbox" checked="checked" sh-isValid="" role="checkbox" class="FormElement ace ace-switch ace-switch-5" />	
								<span  class="lbl"></span>
								<input type="hidden" hi-isValid=""  name="hijackPush" value="1" />
							</label>
						</td>
					</tr> -->
					<tr class="FormData">
						<td class="CaptionTD">描述：</td>
						<td class="DataTD">&nbsp;
						<textarea  rows="2" cols="10" maxlength="100" name="description" multiline="true" class="FormElement ui-widget-content ui-corner-all isSelect147"></textarea>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>