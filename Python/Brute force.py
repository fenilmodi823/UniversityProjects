import itertools

def calculate_distance(points, route):
    """Calculate the total distance of the give route."""
    distance = 0
    for i in range(len(route) - 1):
        distance += ((points[route[i]][0] - points[route[i + 1]][0]) ** 2 + (points[route[i]][1] - points[route[i + 1]][1]) ** 2) ** 0.5
        distance += ((points [route[-1]][0] - points[route[0]][0]) ** 2 + (points[route[-1]][1] - points[route[0]][1]) ** 2) ** 0.5
    return distance

def travelling_salesman_bruteforce(points):
    n = len(points)
    all_permutations = itertools.permutations(range(n))
    shortest_distance = float('inf')
    best_route = None
    for route in all_permutations:
        currebt_distance = calculate_distance(points, route)
        if currebt_distance < shortest_distance:
            shortest_distance = currebt_distance
            best_route = route
    return best_route, shortest_distance

points = [(0, 0), (1, 3), (4, 3), (6, 1),]
best_route, shortest_distance = travelling_salesman_bruteforce(points)
print("Best Route:", best_route)
print("Shortest Distance:", shortest_distance)