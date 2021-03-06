<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/pub/constants.inc" %>
<%@ include file="/WEB-INF/jsp/pub/tags.inc" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
		<meta name="format-detection" content="telephone=no" />
		<title></title>
		<link rel="stylesheet" href="${CONTEXT }/v1.0/css/data/reportData.css">
		<style type="text/css">				
		</style>
		
	</head>
	<body>
		<div class="row head-row">
			<div class="head-outline clearfix">
				<div id="oneDay" class="one-day head-day not-tapped lyHeadDays">今日</div>
				<div id="sevenDays" class="seven-days head-day tapped lyHeadDays">7日</div>
				<div id="fifDays" class="fif-days head-day not-tapped lyHeadDays">15日</div>
				<div id="thirtyDays" class="thirty-days head-day not-tapped lyHeadDays">30日</div>
			</div>
		</div>
		<div class="row chart-row">
			<div class="out-OA">
				<div class="order-left">
					订单量
				</div>
				<div class="amount-right">
					交易额
				</div>
			</div>
			<div id="main" class="chart-inner"></div>
			<div class="chart-instruction">
				<!-- <div class="chart-ins-in">
					触发页面排序
				</div> -->							
			</div>
			<div class="trade-amount">
				7天订单平均交易额：<span id="avMoney">123.00</span>元
			</div>
		</div>	

			<div  id="listCont" class="table-outline row">
			<div class="table-ins">
				<span class="table-in1">详细交易数据</span>
			</div>
			<table class="table" border="1" cellpadding="10" cellspacing="0">
				<!-- <caption>table title and/or explanatory text</caption> -->
				<thead>
					<tr>
						<th></th><th>已收款</th><th>待收款</th><th>已关闭</th>
					</tr>
				</thead>
				<tbody id="tbody">
					<!-- <tr>
						<td class="td-rank">1</td><td class="td-re">33,444</td><td class="td-unre">20</td><td class="td-amount">2,333,000</td>
					</tr> -->
									
				</tbody>
			</table>
		</div>

		</div>
		
		<script src="${CONTEXT }/v1.0/js/jquery-2.1.4.min.js"></script>
		<script src="${CONTEXT }/v1.0/js/jquery.mobile.custom.min.js"></script>
		<script src="${CONTEXT }/v1.0/js/echarts.min.js"></script>
		<script src="${CONTEXT }/v1.0/js/data/common.js"></script>
		<script src="${CONTEXT }/v1.0/js/data/tradeAnalysis.js"></script>
		
	</body>
</html>
