import unittest
from GroceryManagerFunctions import display_menu, add_to_list, remove_from_list, show_items_on_the_list

class TestGroceryManagerApp(unittest.TestCase):
	def test_to_raise_value_error_if_user_input_in_display_menu_is_not_a_number(self):
		select = "Boy"
		with self.assertRaises(ValueError):
			display_menu(select)
			
	def test_to_check_adding_item_to_list(self):
		my_list = []
		item = "ball"
		my_list.append(item)
		self.assertEqual(add_to_list(my_list, item), my_list)

	def test_to_raise_value_error_if_added_item_is_not_a_string(self):
		my_list = []
		item = 1
		with self.assertRaises(ValueError):
			add_to_list(my_list, item)

	def test_to_check_removing_item_to_list(self):
		my_list = []
		item = "ball"
		my_list.append(item)
		my_list.remove("ball")
		self.assertEqual(remove_from_list(my_list, item), my_list)


