from Device import Device


class Counter(Device):

    def __init__(self, name, mass, price):
        super().__init__(name, mass, price)

    def count(self):
        pass