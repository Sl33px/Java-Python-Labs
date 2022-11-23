class Device():

    def __init__(self, name: str, mass: int, price: int):
        self.name = name
        self.price = price
        self.mass = mass

    def device_composition(self):
        # list of devices
        devices_list = ['name1', 'name2', 'name3']

        print(f"{self.name} characteristic:")
        print(f"mass: {self.mass}g")
        print(f"price: {self.price}$")

        if self.name == devices_list[0]:
            print("binary counter: ")
            print("")
        elif self.name == devices_list[1]:
            print("trigger: ")
            print("")
        elif self.name == devices_list[2]:
            print("shift register: ")
            print("")