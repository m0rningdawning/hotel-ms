import React, { useEffect, useState } from "react";
import HmsFooter from "../../components/footer/HmsFooter";
import HmsHeader from "../../components/header/HmsHeader";
import HomeCarousel from "../../components/home-carousel/HomeCarousel";
import "./Home.css";
import { useUser } from "../../components/context/Context";
import axios from "axios";

const Home = () => {
  const { user } = useUser();
  const [isReserved, setIsReserved] = useState({});
  const [reservationChange, setReservationChange] = useState(0);

  const handleReservation = async (room: any) => {
    try {
      const response = await axios.post(
        "http://localhost:8080/reservations/add",
        {
          roomNumber: room,
          email: user,
          dateOfReservation: new Date(),
        }
      );

      if (response.status === 200) {
        console.log("Reservation successful: " + response.data);
        setReservationChange(reservationChange + 1);
      } else {
        console.log("Reservation failed: An error occurred");
        window.alert("Reservation failed: An error occurred");
      }
    } catch (error) {
      window.alert("Error during login: " + error);
    }
  };

  const cancelReservation = async (room: any) => {
    try {
      const response = await axios.post(
        "http://localhost:8080/reservations/remove",
        {
          roomNumber: room,
          email: user,
        }
      );

      if (response.status === 200) {
        console.log("Cancellation successful: " + response.data);
        setReservationChange(reservationChange + 1);
        setIsReserved((prevIsReserved) => {
          const newIsReserved = { ...prevIsReserved };
          //@ts-ignore
          delete newIsReserved[room];
          return newIsReserved;
        });
      } else {
        console.log("Cancellation failed: An error occurred");
        window.alert("Cancellation failed: An error occurred");
      }
    } catch (error) {
      window.alert("Error during cancellation: " + error);
    }
  };

  useEffect(() => {
    const fetchReservations = async () => {
      try {
        const response = await axios.post(
          "http://localhost:8080/reservations/find",
          {
            email: user,
          }
        );

        if (response.status === 200) {
          const reservedRooms = response.data.map(
            (reservation: any) => reservation.roomNumber
          );
          console.log("Reservations fetched successfully: ", reservedRooms);
          const newIsReserved = reservedRooms.reduce((acc: any, curr: any) => {
            acc[curr] = true;
            return acc;
          }, {});
          setIsReserved(newIsReserved);
        } else {
          console.log("Failed to fetch reservations: An error occurred");
        }
      } catch (error) {
        console.log("Error during fetching reservations: " + error);
      }
    };

    if (user) {
      fetchReservations();
    }
  }, [user, reservationChange]);

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
                {/*@ts-ignore*/}
                {isReserved[11] ? (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => cancelReservation(11)}
                  >
                    Cancel
                  </button>
                ) : (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => handleReservation(11)}
                  >
                    Reserve
                  </button>
                )}
              </div>
              <div className="right-aside-col">
                <p className="content-p">2 Bedrooms</p>
                <img id="raccoon" src="/resources/raccoon.jpeg" alt="Raccoon" />
                {/*@ts-ignore*/}
                {isReserved[12] ? (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => cancelReservation(12)}
                  >
                    Cancel
                  </button>
                ) : (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => handleReservation(12)}
                  >
                    Reserve
                  </button>
                )}
              </div>
              <div className="right-aside-col">
                <p className="content-p">3 Bedrooms</p>
                <img id="raccoon" src="/resources/raccoon.jpeg" alt="Raccoon" />
                {/*@ts-ignore*/}
                {isReserved[13] ? (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => cancelReservation(13)}
                  >
                    Cancel
                  </button>
                ) : (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => handleReservation(13)}
                  >
                    Reserve
                  </button>
                )}
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
                {/*@ts-ignore*/}
                {isReserved[21] ? (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => cancelReservation(21)}
                  >
                    Cancel
                  </button>
                ) : (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => handleReservation(21)}
                  >
                    Reserve
                  </button>
                )}
              </div>
              <div className="right-aside-col">
                <p className="content-p">2 Bedrooms</p>
                <img id="doggo" src="/resources/doggo.jpg" alt="Doggo" />
                {/*@ts-ignore*/}
                {isReserved[22] ? (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => cancelReservation(22)}
                  >
                    Cancel
                  </button>
                ) : (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => handleReservation(22)}
                  >
                    Reserve
                  </button>
                )}
              </div>
              <div className="right-aside-col">
                <p className="content-p">3 Bedrooms</p>
                <img id="doggo" src="/resources/doggo.jpg" alt="Doggo" />
                {/*@ts-ignore*/}
                {isReserved[23] ? (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => cancelReservation(23)}
                  >
                    Cancel
                  </button>
                ) : (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => handleReservation(23)}
                  >
                    Reserve
                  </button>
                )}
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
                {/*@ts-ignore*/}
                {isReserved[31] ? (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => cancelReservation(31)}
                  >
                    Cancel
                  </button>
                ) : (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => handleReservation(31)}
                  >
                    Reserve
                  </button>
                )}
              </div>
              <div className="right-aside-col">
                <p className="content-p">2 Bedrooms</p>
                <img id="catto" src="/resources/rich-cat.jpg" alt="Catto" />
                {/*@ts-ignore*/}
                {isReserved[32] ? (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => cancelReservation(32)}
                  >
                    Cancel
                  </button>
                ) : (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => handleReservation(32)}
                  >
                    Reserve
                  </button>
                )}
              </div>
              <div className="right-aside-col">
                <p className="content-p">3 Bedrooms</p>
                <img id="catto" src="/resources/rich-cat.jpg" alt="Catto" />
                {/*@ts-ignore*/}
                {isReserved[33] ? (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => cancelReservation(33)}
                  >
                    Cancel
                  </button>
                ) : (
                  <button
                    type="button"
                    className="btn btn-outline-light reserve-btn"
                    onClick={() => handleReservation(33)}
                  >
                    Reserve
                  </button>
                )}
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
