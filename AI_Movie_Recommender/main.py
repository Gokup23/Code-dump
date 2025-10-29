# main.py
# --- Import the correct classes ---
from movie_user import movie_user
from recommender import recommender

# --- Instantiate the correct class ---
my_user = movie_user("Gopal")
print(f"User created: {my_user.username}")

# --- Call the correctly named methods ---
my_user.add_liked_genre("Action")
my_user.add_liked_genre("Comedy")
print(f"{my_user.username}'s liked genres: {my_user.get_liked_genres()}")

# --- Use lowercase for instance name (convention) ---
recommender_instance = recommender()

# --- Pass the user object to the method ---
suggestion = recommender_instance.recommend_genre(my_user)
print(f"Recommendation for {my_user.username}: {suggestion}")

# Test again after adding another genre
my_user.add_liked_genre("Sci-Fi")
# Get a new suggestion
suggestion = recommender_instance.recommend_genre(my_user)
print(f"New recommendation for {my_user.username}: {suggestion}")

# Example: What happens if action and sci-fi are liked now?
# The first 'if' condition fails, the 'elif comedy' condition runs.
my_user.add_liked_genre("Romance") # Now comedy and romance are liked
suggestion = recommender_instance.recommend_genre(my_user)
print(f"Recommendation after adding romance: {suggestion}") # Should hit the 'else' case now