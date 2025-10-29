# recommender.py
# --- Important: Import the CORRECT class ---
from movie_user import movie_user

class recommender:
    # --- Important: Method takes a user OBJECT, not a genre ---
    def recommend_genre(self, user_obj): # Changed parameter name for clarity
        # --- Important: Call method on the PASSED user object ---
        liked = user_obj.get_liked_genres()

        if not liked:
            return "Start by adding genres you like!"

        # Your rule logic (looks okay)
        if 'action' in liked and 'sci-fi' not in liked:
            return "Since you like action, maybe try sci-fi?"
        elif 'comedy' in liked and 'romance' not in liked:
            return "Comedy fan? How about a romance?"
        elif 'drama' in liked:
             return "Perhaps explore more dramas or try a thriller?"
        else:
            return "Explore genres like thriller or mystery!"