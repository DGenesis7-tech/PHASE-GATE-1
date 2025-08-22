from GroceryManagerFunctions import add_to_list, remove_from_list, show_items_on_the_list

def display_menu():
	select = input( """
	::> WELCOME TO YOUR GROCERY APP <:::::::::::
	1. ADD ITEM TO YOUR GROCERY LIST.
	2. REMOVE ITEM FROM YOUR GROCERY LIST.
	3. DISPLAY ALL ITEMS CURRENTLY IN YOUR LIST.
	4. EXIT APP.
	::::::::::::::::::::::::::::::::::::::::::::
	NOTE!!!!!>
	*YOU CAN ONLY ADD ONE ITEM PER ENTRY!	
	*YOU CAN ONLY REMOVE ONE ITEM PER ENTRY!
	::::::::::::::::::::::::::::::::::::::::::::
	:> PLEASE SELECT AN OPTION FROM THE GIVEN LIST OF OPTIONS (1 - 4) <:
	""")	
	if select.isdigit():
		return int(select)
	else:
		raise ValueError("Input must be a number from ")
		return

my_list = []
while True:
	select = display_menu()	
	if select == None:
		print("Invalid input, Try Again")
		continue
	else:
		break
while select != 4:
	
	if select == 1:
		item = input("Enter item to add to your list : ").strip().lower() 
		add_to_list(my_list, item)
	elif select == 2:
		item = input("Enter item to remove from your list : ").strip().lower()
		remove_from_list(my_list, item)
	elif select == 3	:
		show_items_on_the_list(my_list, item)
	elif select == 4:
		break
	else :
		print("Invalid input")		
	
	select = display_menu()
print("Bye!!!, Come again!")
		