def age_difference(fathers_age, sons_age):
	if not isinstance(fathers_age, (int)):
		raise ValueError("fathers age must be a number with no floating value")
	
	if not isinstance(sons_age, (int)):
		raise ValueError("sons age must be a number with no floating value")
	
	twice_sons_age = sons_age * 2
	if fathers_age > twice_sons_age:
		years_difference = fathers_age - twice_sons_age
	
	elif fathers_age < twice_sons_age:
		years_difference = twice_sons_age - fathers_age
	
	else :
		years_difference = 0
	return years_difference
	
