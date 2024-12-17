package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "해리포터와 마법사의 돌";
        movieReview1.review = "전설의 시작!";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "해리포터와 비밀의 방";
        movieReview2.review = "시리즈 연속 흥행!";

        System.out.println("영화 제목 : " + movieReview1.title + ", 리뷰 : " + movieReview1.review);
        System.out.println("영화 제목 : " + movieReview2.title + ", 리뷰 : " + movieReview2.review);

        // 배열 사용
        MovieReview[] reviews = {movieReview1, movieReview2};
        for (MovieReview review : reviews) {
            System.out.println("영화 제목 : " + review.title + ", 리뷰 : " + review.review);
        }
    }
}
