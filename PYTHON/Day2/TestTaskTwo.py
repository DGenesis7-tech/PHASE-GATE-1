import unittest
from TaskTwo import average_score
class TestTaskTwo(unittest.TestCase):
	def test_to_raise_value_error_if_first_score_is_not_number(self):
		first_score = 'j'
		second_score = 20
		third_score = 20
		with self.assertRaises(ValueError):
			average_score(first_score, second_score, third_score)
	
	def test_to_raise_value_error_if_second_score_is_not_number(self):
		first_score = 20
		second_score = 'g'
		third_score = 20
		with self.assertRaises(ValueError):
			average_score(first_score, second_score, third_score)

	def test_to_raise_value_error_if_third_score_is_not_number(self):
		first_score = 20
		second_score = 20
		third_score = 'm'
		with self.assertRaises(ValueError):
			average_score(first_score, second_score, third_score)
			
	def test_to_return_grade_A_if_average_is_between_90_to_100(self):
		first_score = 100
		second_score = 100
		third_score = 100 
		self.assertEqual(average_score(first_score, second_score, third_score), 'A')
			
	def test_to_return_grade_B_if_average_is_between_90_to_100(self):
		first_score = 100
		second_score = 70
		third_score = 80
		self.assertEqual(average_score(first_score, second_score, third_score), 'B')

	def test_to_return_grade_C_if_average_is_between_90_to_100(self):
		first_score = 70
		second_score = 70
		third_score = 75 
		self.assertEqual(average_score(first_score, second_score, third_score), 'C')
