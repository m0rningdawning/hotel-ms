import React from "react";
import Carousel from "react-bootstrap/Carousel";
import "./HomeCarousel.css";

const HomeCarousel = () => {
  return (
    <center>
      <Carousel className="carousel-home">
        <Carousel.Item>
          <img
            src="https://imageio.forbes.com/specials-images/imageserve/5cdb058a5218470008b0b00f/Nobu-Ryokan-Malibu/0x0.jpg?format=jpg&height=1009&width=2000"
            className="d-block carousel-img"
            alt="Room 1"
          ></img>
          <Carousel.Caption>
            <h3>Luxury Room 1</h3>
            <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img
            src="https://hotelandra.com/wp-content/uploads/2022/01/Andra2483-Andra-Queen-Queen.jpg"
            className="d-block carousel-img"
            alt="Room 2"
          ></img>
          <Carousel.Caption>
            <h3>Luxury Room 2</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img
            src="https://www.redrockresort.com/wp-content/uploads/2020/12/RR-Standard-2-Queen.jpg"
            className="d-block carousel-img"
            alt="Room 3"
          ></img>
          <Carousel.Caption>
            <h3>Luxury Room 3</h3>
            <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
          </Carousel.Caption>
        </Carousel.Item>
      </Carousel>
    </center>
  );
};

export default HomeCarousel;
