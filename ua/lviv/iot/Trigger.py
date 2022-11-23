from Device import Device


class Trigger(Device):

    def __init__(self, name, mass, price):
        super().__init__(name, mass, price)

    def trigger(self):
        pass