from Counter import Counter


class BinaryCounter(Counter):
    def __init__(self, name, mass, price):
        super().__init__(name, mass, price)

    def count(self) -> str:
        pass
