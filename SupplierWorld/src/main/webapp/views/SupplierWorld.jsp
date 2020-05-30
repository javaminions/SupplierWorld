<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SupplierWorld</title>
</head>
<meta charset="utf-8">
<title>Supplier Page</title>
<link rel="stylesheet" href="css/SupplierWorldStyle.css">
<script src="javascript/SupplierWorldScript.js" charset="utf-8"></script>
<body>
	<div class="container">

		<div class="subcontainer">

			<h3>
				<a href="home" id="logout">Logout</a>
			</h3>

			<div class="tab">
				<c:if test="${neworders!=null}">
					<button class="tablinks" onclick="openChoice(event, 'newOrders')">New!</button>
				</c:if>
				<c:if test="${received!=null}">
					<button class="tablinks" onclick="openChoice(event, 'received')">Received</button>
				</c:if>
				<c:if test="${fulfilled!=null}">
					<button class="tablinks" onclick="openChoice(event, 'fulfilled')">Fulfilled</button>
				</c:if>
				<button class="tablinks" onclick="openChoice(event, 'Orders')">All
					Orders</button>
				<button class="tablinks" onclick="openChoice(event, 'Stock')">Check
					Stock</button>
				<button class="tablinks" onclick="openChoice(event, 'ContactUs')">Contact
					Us</button>
			</div>

			<div id=newOrders class="tabcontent">
				<h3>New Orders</h3>
				<form action="confirmOrder" method="post">
					<table>
						<thead>
							<tr>
								<th>Order ID</th>
								<th>Product ID</th>
								<th>Quantity</th>
								<th>Status</th>
								<th>Confirm Quantity</th>
							</tr>
						</thead>
						<c:forEach items="${neworders}" var="o">
							<tbody>

								<tr>
									<td>${o.id}</td>
									<td>${o.productcode}</td>
									<td>${o.quantity}</td>
									<td>${o.status}</td>
									<td><input type="submit" value="Confirm"></td>
									<td><input type="hidden" value="${o.id}" name="orderid"></td>
								</tr>

							</tbody>
						</c:forEach>

					</table>
				</form>
			</div>

			<div id=received class="tabcontent">
				<h3>Received</h3>
				<form action="orderPicked">
					<table>
						<thead>
							<tr>
								<th>Order ID</th>
								<th>Product ID</th>
								<th>Quantity</th>
								<th>Status</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${received}" var="o">
								<tr>
									<td>${o.id}</td>
									<td>${o.productcode}</td>
									<td>${o.quantity}</td>
									<td>${o.status}</td>
								</tr>
								<br>
							</c:forEach>
						</tbody>
					</table>
				</form>
			</div>

			<div id=fulfilled class="tabcontent">
				<h3>Fulfilled</h3>
				<table>
					<thead>
						<tr>
							<th>Order ID</th>
							<th>Product ID</th>
							<th>Quantity</th>
							<th>Status</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${fulfilled}" var="o">
							<tr>
								<td>${o.id}</td>
								<td>${o.productcode}</td>
								<td>${o.quantity}</td>
								<td>${o.status}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<div id="Orders" class="tabcontent">
				<h3>Orders</h3>
				<table>
					<thead>
						<tr>
							<th>Order ID</th>
							<th>Product ID</th>
							<th>Quantity</th>
							<th>Status</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${orders}" var="o">
							<tr>
								<td>${o.id}</td>
								<td>${o.productcode}</td>
								<td>${o.quantity}</td>
								<td>${o.status}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<div id="Stock" class="tabcontent">
				<h3>Product Stock</h3>
				<table>
					<thead>
						<tr>
							<th>Product ID</th>
							<th>Stock Available</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products}" var="p">
							<tr>
								<td>${p.id}</td>
								<td>${p.quantity}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<div id="ContactUs" class="tabcontent">
				<h3>Contact Us</h3>
				<p>We JAVA MINIONS developed this website through the UST-Global
					program. Our strengths are Strong Attention to detail, Good Java
					Programming Skills, Multitasking experts, Well-developed soft
					skills, and Excellence-driven. We are cool.</p>
			</div>
		</div>

	</div>

</body>
</html>