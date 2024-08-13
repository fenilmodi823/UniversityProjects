#include <stdio.h>

int main() {
    int num = 42;
    int* ptr = &num;

    printf("The address of 'num' is %p\n", &num);
    printf("The value of 'ptr' is %p\n", ptr);

    return 0;
}
