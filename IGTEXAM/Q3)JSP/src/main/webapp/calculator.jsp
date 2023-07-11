

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.math.RoundingMode" %>
<%@ page import="java.util.*" %>

 

<!DOCTYPE html>
<html>
<head>
<title>EMI Calculation Result</title>
</head>
<body>
<h1>EMI Calculation Result</h1>

<%-- Get the form data --%>
<% 
        double principal = Double.parseDouble(request.getParameter("principal"));
        double interest = Double.parseDouble(request.getParameter("interest"));
        int time = Integer.parseInt(request.getParameter("time"));

        double rateOfInterest = interest / 100.0;
        double monthlyRate = rateOfInterest / 12.0;
        double emi = principal * monthlyRate * Math.pow(1 + monthlyRate, time) / (Math.pow(1 + monthlyRate, time) - 1);
        double totalAmount = emi * time;

        // Format the calculated values
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        String formattedEmi = df.format(emi);
        String formattedTotalAmount = df.format(totalAmount);
    %>

<p><strong>Principal Amount:</strong> <%= principal %></p>
<p><strong>Rate of Interest:</strong> <%= interest %> %</p>
<p><strong>Time (in months):</strong> <%= time %></p>
<p><strong>EMI per month:</strong> <%= formattedEmi %></p>
<p><strong>Total Amount:</strong> <%= formattedTotalAmount %></p>

</body>
</html>