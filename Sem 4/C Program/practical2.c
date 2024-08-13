#include <stdio.h>

int main()
{
    char operator;
    double num1, num2, result;

    printf("Enter an operator (+, -, *, /): ");
    scanf(" %c", &operator); // Added a space before %c to consume any newline character left in the input buffer.

    printf("Enter two numbers: ");
    scanf("%lf %lf", &num1, &num2);

    switch (operator)
    {
    case '+':
        result = num1 + num2;
        printf("%.2lf + %.2lf = %.2lf", num1, num2, result);
        break;

    case '-':
        result = num1 - num2;
        printf("%.2lf - %.2lf = %.2lf", num1, num2, result);
        break;

    case '*':
        result = num1 * num2;
        printf("%.2lf * %.2lf = %.2lf", num1, num2, result);
        break;

    case '/':
        if (num2 == 0)
        {
            printf("Error: Divide by zero");
        }
        else
        {
            result = num1 / num2;
            printf("%.2lf / %.2lf = %.2lf", num1, num2, result);
        }
        break;

    default:
        printf("Error: Invalid operator");
        break;
    }

    return 0;
}
