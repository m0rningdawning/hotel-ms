import React from "react";
import Carousel from "react-bootstrap/Carousel";
import "./HomeCarousel.css";

const HomeCarousel = () => {
  return (
    <center>
      <Carousel className="carousel-home">
        <Carousel.Item>
          <img
            src="https://www.homestratosphere.com/wp-content/uploads/2014/05/shutterstock_30411274.jpg"
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
            src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.pinimg.com%2Foriginals%2Fad%2F34%2Fad%2Fad34ad8485eb2eb9fce806826b65375d.jpg&f=1&nofb=1&ipt=c9b5812c4d4154532d886e54e05cf6083a6f800d9e527252cae98dcf8aefa2fe&ipo=images"
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
