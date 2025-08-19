import unittest
from TaskThree import like_system
class TestTaskThree(unittest.TestCase):

	def test_to_raise_value_error_if_list_is_not_string_collection(self):
		list = [1, 2, 2]
		with self.assertRaises(ValueError):
			like_system(list)

	def test_to_raise_value_error_if_length_of_list_is_zero(self):
		myList = []
		with self.assertRaises(ValueError):
			like_system(list)

	def test_to_return_correct_result_if_list_length_is_greater_than_one(self):
		list = ["Max"]
		result = list[0]+" likes this"
		self.assertEqual(like_system(list), result)
