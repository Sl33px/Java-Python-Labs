from Device import Device


class ShiftRegister(Device):
    def __init__(self, name, mass, price):
        super().__init__(name, mass, price)

    def forward_signal(self):
        print("Do whatever shift register does.")

