class Node:
    def __init__(self, surname, name, group, birth_date, rating):
        self.surname = surname
        self.name = name
        self.group = group
        self.birth_date = birth_date
        self.rating = rating
        self.next = None

    def __str__(self):
        return str(self.__class__) + ": " + str(self.__dict__)


class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
    
    # def __str__(self):
    #     return str(self.__class__) + ": " + str(self.__dict__)

    def insert_to_start(self, surname, name, group, birth_date, rating):
        node = Node(surname, name, group, birth_date, rating)
        node.next = self.head

        self.head = node

        if self.tail is None:
            self.tail = node


    def insert_to_end(self, surname, name, group, birth_date, rating):
        node = Node(surname, name, group, birth_date, rating)

        if self.tail is not None:
            self.tail.next = node
        
        if self.head is None:
            self.head = node
        
        self.tail = node
    
    def to_list(self):
        output = []
        current = self.head

        while current:
            output.append(current)
            current = current.next
        
        for obj in output:
            print(obj)
        
        return output
    
    def find(self, surname):
        if self.head is None:
            print("list is empty")
        
        current = self.head
        while current:
            if current.surname == surname:
                print("---------")
                print("surname:", current.surname)
                print("name:", current.name)
                print("group:", current.group)
                print("birth date:", current.birth_date)
                print("rating:", current.rating)
                print("---------")
                return
            elif current.next is None and current.surname is not surname:
                print("element is not found")
            current = current.next
    
    def sorting_by_rating_by_inserting(self, list):
        list_of_rating = []
        
        for i in range(len(list)):
            list_of_rating.append(list[i].__dict__["rating"])

        sorted_list_of_rating = sorted(list_of_rating)

        total_list = []

        for i in range(len(sorted_list_of_rating)):
            for j in range(len(list)):
                if list[j].__dict__["rating"] == sorted_list_of_rating[i]:
                    list[j].__dict__["next"] = list[i]

                    total_list.append(list[j])
        
        total_list[-1].__dict__["next"] = None
        print("-------")
        print("Total array:")
        for obj in total_list:
            print(obj)

    
list1 = LinkedList()
list1.insert_to_end('Shaposhnikov', 'Dima', 'IR-22', '12.04.2004', 10)
list1.insert_to_end('Sukharanko', 'Alexander', 'MB-12', '28.07.2007', 15)
list1.insert_to_start('gerga', 'gaergae', 'rea-1434', '21.04.2000', 20)
list1.insert_to_end('Shevtsov', 'Vitya', 'AW-41', '05.04.2001', 1)
list1.insert_to_start('bgrfb', 'bd', 'VP-12', '03.11.2005', 5)
# list1.to_list()
# list1.find('Sukharanko')

list = list1.to_list()
list1.sorting_by_rating_by_inserting(list)