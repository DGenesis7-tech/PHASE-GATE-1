def displayMenu(): 
	output = """
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
	"""
	return output
output = displayMenu()
print(output)
