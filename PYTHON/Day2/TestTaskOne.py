import unittest
from TaskOne import age_difference

class TestTaskOne(unittest.TestCase):
	def test_to_raise_value_error_if_fathers_age_is_not_a_number(self):
		fathers_age = 'A'
		sons_age = 10
		with self.assertRaises(ValueError):
			age_difference(fathers_age, sons_age)
			
	def test_to_raise_value_error_if_sons_age_is_not_a_number(self):
		fathers_age = 50
		sons_age = 'a'
		with self.assertRaises(ValueError):
			age_difference(fathers_age, sons_age)
			
	def test_to_check_if_twice_of_sons_age_divide_2_is_sons_age(self):
		fathers_age = 50
		sons_age = 10
		twice_sons_age = sons_age * 2
		self.assertEqual(age_difference(fathers_age, sons_age), 30)

	def test_to_return_positive_if_fathers_age_is_greater_than_twice_sons_age(self):
		fathers_age = 40
		sons_age = 10
		self.assertEqual(age_difference(fathers_age, sons_age), 20)

	def test_to_return_positive_if_fathers_age_is_less_than_twice_sons_age(self):
		fathers_age = 50
		sons_age = 26
		self.assertEqual(age_difference(fathers_age, sons_age), 2)

	def test_to_return_zero_if_fathers_age_is_equal_to_twice_sons_age(self):
		fathers_age = 50
		sons_age = 25
		self.assertEqual(age_difference(fathers_age, sons_age), 0)
