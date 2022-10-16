import 'dart:io';

class Ab {
  int a = 0, b = 0;

  Ab(int a, int b) {
    this.a = a;
    this.b = b;
  }

  void display() {
    print("${a - b}");
  }
}

void main() {
  Ab obj = new Ab(7);
  obj.display();
}
