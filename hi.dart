class animalia {
  String fam = "";
  animalia(String fam) {
    this.fam = fam;
  }

  void show() {
    print("Kingdom: $fam");
  }
}

class iv extends animalia {
  String sfam = "";
  iv(String sfam) : super("Invertaebrates") {
    this.sfam = sfam;
  }
  void show() {
    super.show();
    print("Sub Kingdom: $sfam");
  }
}

class v extends animalia {
  String sfam = "";
  v(String sfam) : super("Vertaebrates") {
    this.sfam = sfam;
  }
  void show() {
    super.show();
    print("Sub Kingdom: $sfam");
  }
}

class mammal extends v {
  String family = "";
  mammal(String family) : super("Mammal") {
    this.family = family;
  }
  void show() {
    super.show();
    print("Family: $family");
  }
}

class dog extends mammal {
  String name = "";
  int age = 0;
  dog(String name, int age) : super("Dog") {
    this.name = name;
    this.age = age;
  }
  void show() {
    super.show();
    print("Name: $name");
    print("Age: $age years");
  }
}

void main() {
  dog obj = new dog("Tiger", 5);
  obj.show();
  iv obj1 = new iv('Cnidarians');
  obj1.show();
}
