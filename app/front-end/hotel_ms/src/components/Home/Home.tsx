import React from "react";
import { Link } from "react-router-dom";

const Home = () => {
  const raccoonStyle = {
    width: "150px",
    height: "150px",
  };

  const linkList = [
    { to: "*", text: "Test 404 page" },
    { to: "/admin", text: "Go to Admin Page" },
  ];

  return (
    <>
      <h1>Home Page</h1>
      <div>
        <img
          id="raccoon"
          style={raccoonStyle}
          src="/resources/raccoon.jpeg"
          alt="Raccoon"
        />
      </div>
      <ul className="list-group">
        <li className="list-group-item">
          <Link to={linkList[1].to}>{linkList[1].text}</Link>
        </li>
        <li className="list-group-item">
          <Link to={linkList[0].to}>{linkList[0].text}</Link>
        </li>
      </ul>
    </>
  );
};

export default Home;
