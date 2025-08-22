import unittest
from ParkingSystemFunction import car_slots, park_car_from_right, park_car_from_left, remove_car_from_left_or_right

class TestParkingSystem(unittest.TestCase):
	def test_to_check_length_of_list_is_20(self):
		my_list = []
		for index in range(0, 20):
			my_list.append(0)
		self.assertEqual(car_slots(my_list), my_list)
		
	def test_to_raise_value_error_if_choice_to_park_from_right_is_number(self):
		choice = 2		
		my_list = []
		for index in range(0, 20):
			my_list.append(0)
		with self.assertRaises(ValueError):
			park_car_from_right(my_list, choice)	
		
	def test_to_check_if_park_from_right_replaces_0_with_1(self):
		my_list = []
		for index in range(0, 20):
			my_list.append(0)
		my_list[19] += 1	
		self.assertEqual(park_car_from_right(my_list, "right"), my_list)

	def test_to_check_if_park_from_left_replaces_0_with_1(self):
		my_list = []
		for index in range(0, 20):
			my_list.append(0)
		my_list[0] += 1	
		self.assertEqual(park_car_from_right(my_list, "left"), my_list)

	def test_to_raise_value_error_if_choice_to_park_from_left_is_number(self):
		choice = 2		
		my_list = []
		for index in range(0, 20):
			my_list.append(0)
		with self.assertRaises(ValueError):
			park_car_from_left(my_list, choice)	

	def test_to_check_if_car_remove_from_right_replaces_1_with_0(self):
		my_list = []
		for index in range(0, 20):
			my_list.append(0)
		my_list[19] += 1	
		my_list[19] -= 1
		self.assertEqual(remove_car_from_left_or_right(my_list, 19), my_list)
			
	def test_to_check_if_car_remove_from_right_replaces_1_with_0(self):
		my_list = []
		for index in range(0, 20):
			my_list.append(0)
		my_list[1] += 1	
		my_list[1] -= 1
		self.assertEqual(remove_car_from_left_or_right(my_list, 1), my_list)

	def test_to_raise_value_error_if_car_remove_from_right_to_from_left_is_string(self):
		choice = "choice"	
		my_list = []
		for index in range(0, 20):
			my_list.append(0)
		with self.assertRaises(ValueError):
			remove_car_from_left_or_right(my_list, choice)	

