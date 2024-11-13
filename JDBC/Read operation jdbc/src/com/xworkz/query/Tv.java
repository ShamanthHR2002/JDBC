package com.xworkz.query;

public class Tv {

	String insertQuery = "INSERT INTO tv_table (id, owner_name, email, password, phone_number, brand, model, screen_size_inches, resolution, price, release_date) VALUES "
			+ "(1, 'Aarav Singh', 'aarav.singh@example.com', 'password456', '919876543300', 'Sony', 'Bravia XR A80J', 55, '4K', 119999.99, '2024-01-20'), "
			+ "(2, 'Priya Malhotra', 'priya.malhotra@example.com', 'password456', '919876543301', 'Samsung', 'QLED QN90A', 65, '4K', 139999.99, '2024-02-25'), "
			+ "(3, 'Rohan Das', 'rohan.das@example.com', 'password456', '919876543302', 'LG', 'OLED C1', 55, '4K', 149999.99, '2024-03-15'), "
			+ "(4, 'Neha Sharma', 'neha.sharma@example.com', 'password456', '919876543303', 'TCL', '6-Series R635', 65, '4K', 79999.99, '2024-04-07'), "
			+ "(5, 'Ankit Yadav', 'ankit.yadav@example.com', 'password456', '919876543304', 'Hisense', 'ULED U8G', 55, '4K', 59999.99, '2024-05-18'), "
			+ "(6, 'Simran Gupta', 'simran.gupta@example.com', 'password456', '919876543305', 'Vizio', 'P-Series Quantum', 65, '4K', 89999.99, '2024-06-28'), "
			+ "(7, 'Vivek Jain', 'vivek.jain@example.com', 'password456', '919876543306', 'Sony', 'Bravia XR A90J', 65, '4K', 199999.99, '2024-07-20'), "
			+ "(8, 'Pooja Khanna', 'pooja.khanna@example.com', 'password456', '919876543307', 'LG', 'NanoCell 90 Series', 55, '4K', 49999.99, '2024-08-11'), "
			+ "(9, 'Arjun Sen', 'arjun.sen@example.com', 'password456', '919876543308', 'Samsung', 'The Frame LS03T', 43, '4K', 99999.99, '2024-09-05'), "
			+ "(10, 'Sonal Rao', 'sonal.rao@example.com', 'password456', '919876543309', 'TCL', '5-Series S535', 55, '4K', 54999.99, '2024-10-26'), "
			+ "(11, 'Ravi Bansal', 'ravi.bansal@example.com', 'password456', '919876543310', 'Sony', 'Bravia X90J', 75, '4K', 179999.99, '2024-11-08'), "
			+ "(12, 'Nikita Arora', 'nikita.arora@example.com', 'password456', '919876543311', 'Hisense', 'Laser TV 100L5F', 100, '4K', 349999.99, '2024-12-18'), "
			+ "(13, 'Manoj Khurana', 'manoj.khurana@example.com', 'password456', '919876543312', 'Vizio', 'OLED H1', 65, '4K', 159999.99, '2024-01-22'), "
			+ "(14, 'Rajesh Nair', 'rajesh.nair@example.com', 'password456', '919876543313', 'LG', 'OLED G1', 55, '4K', 169999.99, '2024-02-19'), "
			+ "(15, 'Meera Pillai', 'meera.pillai@example.com', 'password456', '919876543314', 'Toshiba', 'C350 Fire TV', 43, '4K', 29999.99, '2024-03-20'), "
			+ "(16, 'Kartik Verma', 'kartik.verma@example.com', 'password456', '919876543315', 'Sony', 'Z9J 8K', 85, '8K', 299999.99, '2024-04-25'), "
			+ "(17, 'Ritika Jain', 'ritika.jain@example.com', 'password456', '919876543316', 'Samsung', 'Neo QLED QN85A', 50, '4K', 84999.99, '2024-05-16'), "
			+ "(18, 'Ajay Rathi', 'ajay.rathi@example.com', 'password456', '919876543317', 'TCL', '4-Series S435', 43, '4K', 34999.99, '2024-06-12'), "
			+ "(19, 'Maya Bose', 'maya.bose@example.com', 'password456', '919876543318', 'LG', 'QNED MiniLED 90 Series', 65, '4K', 149999.99, '2024-07-04'), "
			+ "(20, 'Rahul Khanna', 'rahul.khanna@example.com', 'password456', '919876543319', 'Sony', 'Bravia X95J', 75, '4K', 209999.99, '2024-08-22');";

	public String getInsertQuery() {
		return insertQuery;
	}
}
