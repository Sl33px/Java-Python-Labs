from Trigger import Trigger


class RSTrigger(Trigger):
    def __init__(self, name, mass, price):
        super().__init__(name, mass, price)

    def trigger(self):
        print("Do whatever RS-trigger does.")

