from Device import Device


class Multiplexer(Device):
    def __init__(self, name, mass, price):
        super().__init__(name, mass, price)

    def forward_signal(self):
        print("Do whatever multiplexer does.")
