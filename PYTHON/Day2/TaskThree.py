def like_system(list):
	output = ""
	if isinstance(list, (int, float)):
		raise ValueError("list must be a string")
	if (len(list) == null):
		output = "no one likes this"
		raise ValueError("list must be a string")
		
	if (len(list) == 1): 
		output = list[0]+" likes this"
		
	if (len(list) == 2): 
		output = list[0]+" and "+ list[1]+" likes this"
	if (len(list) == 3):
		output = list[0]+", "+list[1]+" and " + list[2]+" likes this"
	if (len(list) > 3): 
		output = list[0]+", "+list[1]+" and "+str((len(list) - 2))+" others like this"
	return output
	
	
mylist = ["Max", "John", "Mark", "John"]
print(like_system(mylist));
