package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {


    Map<Long,Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review llt = new Review(1L, "Linus Tech Tips", "Specialist in PC Building");
        Review mb = new Review(2L, "Marques Brownlee", "All around Tech Reviewer");
        Review rr = new Review(3L, "Rene Ritchie", "Apple Tech Youtube");

        reviewsList.put(llt.getId(), llt);
        reviewsList.put(mb.getId(), mb);
        reviewsList.put(rr.getId(), rr);

    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for (Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
