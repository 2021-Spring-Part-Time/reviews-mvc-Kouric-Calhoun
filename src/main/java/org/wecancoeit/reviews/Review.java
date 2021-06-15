package org.wecancoeit.reviews;

public class Review {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;


    public Long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Review(long id, String name, String description, String imageUrl) {
        this.id=id;
        this.name=name;
        this.description= description;
        this.imageUrl=imageUrl;
    }


}
