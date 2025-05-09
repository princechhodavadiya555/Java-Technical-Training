#Write a Python code to print either "CSE" or "ECE" with O(1) time complexity.

#Given a seating arrangement like this:
#1,2,3
#4,5,6
#7,8,9
#10,11,12
#13,14,15

#Take input for number of rows, columns, and seat number. Output "CSE" if the seat is in the first row, first column, or last column.

#Output "ECE" for all other seats.
rows = int(input("Rows: "))
cols = int(input("Cols: "))
seat_no = int(input("Seat No: "))

if seat_no<=cols or seat_no%cols==1 or seat_no%cols==0:
	print('CSE')
else:
	print('ECE')