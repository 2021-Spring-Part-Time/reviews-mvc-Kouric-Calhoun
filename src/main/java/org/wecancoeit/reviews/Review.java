package org.wecancoeit.reviews;

public class Review {
    private Long id;
    private String name;
    private String description;

    public Long getId() {
        return id;
    }

    public Review(long id, String name, String description) {
        this.id=id;
        this.name=name;
        this.description= description;
    }


}
