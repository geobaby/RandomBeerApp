$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/beers"
    }).then(function(data) {
    	$('.id').append(data.id);
    	$('.name').append(data.name);
    	$('.description').append(data.description);
    	$('.abv').append(data.abv);
    	$('.brewery').append(data.brewery);
    });
});