import React from "react";
import { Link } from "react-router-dom";

const Home = () => {
  const raccoonStyle = {
    width: "150px",
    height: "150px",
  };

  return (
    <div>
      <h1>Home Page</h1>
      <div>
        <img
          id="raccoon"
          style={raccoonStyle}
          src="/resources/raccoon.jpeg"
          alt="Raccoon"
        />
      </div>
      <Link to="/admin">Go to Admin Page</Link>
    </div>
  );
};

export default Home;
