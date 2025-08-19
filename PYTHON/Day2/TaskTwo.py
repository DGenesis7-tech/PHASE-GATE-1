def average_score(first_score, second_score, third_score):
	if not isinstance(first_score, (int)):
		raise ValueError("first score must be a number with no floating value")

	if not isinstance(second_score, (int)):
		raise ValueError("second score must be a number with no floating value")

	if not isinstance(third_score, (int)):
		raise ValueError("third score must be a number with no floating value")

	average_score = (first_score + second_score + third_score) // 3;
	grade = ''

	if average_score >= 90 and average_score <= 100:
		grade = "A";		
	if average_score >= 80 and average_score < 90:
		grade = "B";
	if average_score >= 70 and average_score < 80:
		grade = "C";
	if average_score >= 60 and average_score < 70:
		grade = "D";
	if average_score >= 0 and average_score < 60:
		grade = "F";
	return grade	

print(average_score(100, 70, 80))	