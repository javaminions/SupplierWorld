<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
				<button class="tablinks" onclick="openChoice(event, 'Orders')">Orders</button>
				<button class="tablinks" onclick="openChoice(event, 'Stock')">Check
					Stock</button>
				<button class="tablinks" onclick="openChoice(event, 'ContactUs')">Contact
					Us</button>
			</div>

			<div id="Orders" class="tabcontent">
				<h3>Orders</h3>
				<table>
					<thead>
						<tr>
							<th>Order ID</th>
							<th>Product ID</th>
							<th>Quantity</th>
							<th>Date Ordered</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>101</td>
							<td>520</td>
							<td>01-15-2020</td>
						</tr>
						<tr>
							<td>2</td>
							<td>502</td>
							<td>100</td>
							<td>01-19-2020</td>
						</tr>
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
						<tr>
							<td>101</td>
							<td>5910</td>
						</tr>
						<tr>
							<td>202</td>
							<td>1000</td>
						</tr>
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