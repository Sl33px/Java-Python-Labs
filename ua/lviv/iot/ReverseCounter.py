from Counter import Counter


class ReverseCounter(Counter):
    def __init__(self, name, mass, price):
        super().__init__(name, mass, price)

    def count(self):
        print("Do whatever reverse counter does.")
