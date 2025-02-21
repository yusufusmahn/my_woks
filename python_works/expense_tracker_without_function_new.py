store_expenses = []

print("WELCOME TO SEMICOLON EXPRESS TRACKER APP")
print("-------------------------------------------------")

while True:
	print("""
1. Add an expense
2. View all expenses
3. Calculate total expenses
4. Exit
""")
    
	choice = int(input("Enter your choice: "))
	while choice not in {1,2,3,4}:
		choice = int(input("Incorrect number selected, kindly enter a correct number!: "))

	if choice == 1:
		date = input("Enter the date (YYYY-MM-DD): ")
		description = str(input("Enter the description: "))
		while type(description) != str:
			description = str(input("Incorrect!!!Re-enter the description: "))

		amount = float(input("Enter the amount: "))
		while amount < 1:
			amount = float(input("Incorrect!!! Kindly enter correct amount: "))
		expense = {"date": date, "description": description, "amount": amount}
		store_expenses.append(expense)
		print("Expense added!")

	elif choice == 2:
		if len(store_expenses) == 0:
			print("No expenses recorded, Kindly select :1: to add Expense.")
		else:
			print("Expenses:")

		for expense in store_expenses:
			print(f"{expense['date']},{expense['description']}:,${expense['amount']:.2f}")

	elif choice == 3:
		total = 0
		if len(store_expenses) == 0:
			print("No expenses recorded, Kindly select :1: to add Expense.")
		else:
			for expense in store_expenses:
				total += expense['amount']
		print(f"Total Expenses: ${total:.2f}")

	elif choice == 4:
		print("Exiting the app. Goodbye!")
		break
