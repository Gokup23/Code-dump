# movie_user.py
class movie_user:
    def __init__(self, username):
        self.username = username
        self.liked_genres = set()

    # Method name consistency (optional but good practice):
    # Changed from add_genre_liked to add_liked_genre
    def add_liked_genre(self, genre):
        self.liked_genres.add(genre.lower())

    # Changed from get_genre_liked to get_liked_genres
    def get_liked_genres(self):
        return self.liked_genres