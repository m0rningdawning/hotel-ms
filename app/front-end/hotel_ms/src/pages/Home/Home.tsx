import React from "react";
import HmsFooter from "../../components/footer/HmsFooter";
import HmsHeader from "../../components/header/HmsHeader";
import HomeCarousel from "../../components/home-carousel/HomeCarousel";
import { useUser } from "../../components/context/Context";
import "./Home.css";

const Home = () => {
  return (
    <>
      <HmsHeader />
      <div>
        <img id="doggo" src="/resources/doggo.jpg" alt="Doggo" />
      </div>
      <div className="content-wrapper-admin">
        <div className="content-aside">
          <center>
            <h1 className="content-h1">Rooms</h1>
          </center>
          <p id="p-content">
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Fugit ipsum
            quo consectetur nulla unde, ea amet cumque voluptatem, nam quam
            libero alias impedit similique, autem sapiente delectus nisi
            quisquam doloremque? Nihil possimus temporibus veniam sequi, aliquam
            quia error soluta eius libero suscipit iure veritatis tenetur sit
            adipisci, sapiente repellendus dolore, reiciendis fugit. Mollitia,
            vitae sit. Omnis, ipsa. Molestiae quasi ea doloremque voluptatum
            aliquid aliquam labore facere, consectetur natus animi error nobis
            hic, quas quis, tenetur voluptatem reprehenderit optio ducimus.
            Corporis inventore dicta nihil perferendis at ex. Maxime molestiae
            numquam temporibus labore vel quam veritatis iste repudiandae eius
            illum ad dignissimos, modi quo rerum aliquid nulla consequuntur
            laboriosam quaerat facere facilis. Incidunt commodi numquam, eveniet
            corrupti accusamus praesentium officiis dolore, magni nostrum ipsum
            dolorum libero delectus amet sapiente repellat ipsam ea. Voluptates
            eaque eius ipsa inventore magni repudiandae, temporibus, quaerat at
            voluptatum illum porro alias cupiditate quisquam excepturi cum
            labore quae.
          </p>
          <HomeCarousel />
        </div>
        <div className="content-aside">
          <div className="right-aside-row" id="ra-row1">
            <div className="right-aside-header">
              <h2 className="content-h2">Regular rooms</h2>
            </div>
            <div className="right-aside-content">
              <div className="right-aside-col">
                <p className="content-p">1 Bedroom</p>
                <img id="raccoon" src="/resources/raccoon.jpeg" alt="Raccoon" />
                <button
                  type="button"
                  className="btn btn-outline-light reserve-btn"
                >
                  Reserve
                </button>
              </div>
              <div className="right-aside-col">
                <p className="content-p">2 Bedrooms</p>
                <img id="raccoon" src="/resources/raccoon.jpeg" alt="Raccoon" />
                <button
                  type="button"
                  className="btn btn-outline-light reserve-btn"
                >
                  Reserve
                </button>
              </div>
              <div className="right-aside-col">
                <p className="content-p">3 Bedrooms</p>
                <img id="raccoon" src="/resources/raccoon.jpeg" alt="Raccoon" />
                <button
                  type="button"
                  className="btn btn-outline-light reserve-btn"
                >
                  Reserve
                </button>
              </div>
            </div>
          </div>
          <div className="right-aside-row" id="ra-row2">
            <div className="right-aside-header">
              <h2 className="content-h2">Deluxe rooms</h2>
            </div>
            <div className="right-aside-content">
              <div className="right-aside-col">
                <p className="content-p">1 Bedroom</p>
                <img id="doggo" src="/resources/doggo.jpg" alt="Doggo" />
                <button
                  type="button"
                  className="btn btn-outline-light reserve-btn"
                >
                  Reserve
                </button>
              </div>
              <div className="right-aside-col">
                <p className="content-p">2 Bedrooms</p>
                <img id="doggo" src="/resources/doggo.jpg" alt="Doggo" />
                <button
                  type="button"
                  className="btn btn-outline-light reserve-btn"
                >
                  Reserve
                </button>
              </div>
              <div className="right-aside-col">
                <p className="content-p">3 Bedrooms</p>
                <img id="doggo" src="/resources/doggo.jpg" alt="Doggo" />
                <button
                  type="button"
                  className="btn btn-outline-light reserve-btn"
                >
                  Reserve
                </button>
              </div>
            </div>
          </div>
          <div className="right-aside-row" id="ra-row3">
            <div className="right-aside-header">
              <h2 className="content-h2">Luxury rooms</h2>
            </div>
            <div className="right-aside-content">
              <div className="right-aside-col">
                <p className="content-p">1 Bedroom</p>
                <img id="catto" src="/resources/rich-cat.jpg" alt="Catto" />
                <button
                  type="button"
                  className="btn btn-outline-light reserve-btn"
                >
                  Reserve
                </button>
              </div>
              <div className="right-aside-col">
                <p className="content-p">2 Bedrooms</p>
                <img id="catto" src="/resources/rich-cat.jpg" alt="Catto" />
                <button
                  type="button"
                  className="btn btn-outline-light reserve-btn"
                >
                  Reserve
                </button>
              </div>
              <div className="right-aside-col">
                <p className="content-p">3 Bedrooms</p>
                <img id="catto" src="/resources/rich-cat.jpg" alt="Catto" />
                <button
                  type="button"
                  className="btn btn-outline-light reserve-btn"
                >
                  Reserve
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
      <HmsFooter />
    </>
  );
};

export default Home;
