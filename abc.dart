import 'dart:io';

void largest(lst) {
  int s = lst[0];
  int l = 0;
  for (int i = 0; i < lst.length; i++) {
    if (s > lst[i]) {
      s = lst[i];
    }
    if (l < lst[i]) {
      l = lst[i];
    }
  }
  print("the smallest is $s");
  print("the largest is $l");
}

void main() {
  int m;
  // ignore: prefer_typing_uninitialized_variables
  var lst1 = [];
  num n;
  int i;
  print("ENTER THE NUMBER OF ELEMENTS YOU WANT TO ENTER");
  m = int.parse(stdin.readLineSync()!);
  print("ENTER THE ELEMENTS IN THE LIST");
  for (i = 0; i < m; i++) {
    n = int.parse(stdin.readLineSync()!);
    lst1.add(n);
  }
  print("the list is");
  largest(lst1);
}
