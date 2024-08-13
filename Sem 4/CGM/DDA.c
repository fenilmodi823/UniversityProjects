#include <stdio.h>
#include <math.h>
#include <graphics.h>

int main() {
    int x, y, x1, y1, x2, y2, dx, dy, step, xinc, yinc, i;
    int gd = DETECT, gm;
    
    initgraph(&gd, &gm, "C:\\MinGW\\include\\graphics.h");  // Adjust the path accordingly

    printf("Enter the starting coordinates: ");
    scanf("%d%d", &x1, &y1);
    printf("Enter the ending coordinates: ");
    scanf("%d%d", &x2, &y2);

    dx = (x2 - x1);
    dy = (y2 - y1);

    if (abs(dx) > abs(dy))
        step = abs(dx);
    else
        step = abs(dy);

    xinc = dx / step;
    yinc = dy / step;

    x = x1;
    y = y1;

    i = 1;
    while (i <= step) {
        putpixel(x, y, 4);
        x = x + xinc;
        y = y + yinc;
        i = i + 1;
    }

    getch();
    closegraph();

    return 0;
}
