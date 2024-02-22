#include <stdio.h>
#include <stdlib.h>

void drawLine(int x1, int y1, int x2, int y2) {
    int dx, dy, x, y, p, steps;

    dx = x2 - x1;
    dy = y2 - y1;

    if (abs(dx) > abs(dy)) {
        steps = abs(dx);
    } else {
        steps = abs(dy);
    }

    float xIncrement = (float)dx / (float)steps;
    float yIncrement = (float)dy / (float)steps;

    x = x1;
    y = y1;

    printf("Points on the line:\n");

    for (int i = 0; i < steps; i++) {
        printf("(%d, %d)\n", x, y);
        x += xIncrement;
        y += yIncrement;
    }
}

int main() {
    int x1, y1, x2, y2;

    printf("Enter the coordinates of the first point (x1 y1): ");
    scanf("%d %d", &x1, &y1);

    printf("Enter the coordinates of the second point (x2 y2): ");
    scanf("%d %d", &x2, &y2);

    drawLine(x1, y1, x2, y2);

    return 0;
}
