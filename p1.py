class Student:
    def __init__(self, name, age, marks):
        self.name = name
        self.age = age
        self.marks = marks

    def display(self):
        print("Student Name:", self.name)
        print("Age:", self.age)
        print("Marks:", self.marks)


student = Student("Abhay", 21, 85)

student.display()