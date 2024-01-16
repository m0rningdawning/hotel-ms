import React, { useEffect, useState } from 'react';
import axios from 'axios';

interface Guest {
  id: number;
  firstName: string;
  lastName: string;
}

const GuestList = () => {
  const [guests, setGuests] = useState<Guest[]>([]);

  useEffect(() => {
    const fetchGuests = async () => {
      try {
        const response = await axios.get('http://localhost:8080/guests');
        setGuests(response.data);
        console.log(response.data);
      } catch (error) {
        console.error('Error fetching guests:', error);
      }
    };

    fetchGuests();
  }, []);

  return (
    <div>
      <h1>Guest List</h1>
      <ul>
        {guests.map((guest) => (
          <li key={guest.id}>{guest.id?.toString()}, {guest.firstName}, {guest.lastName}</li>
        ))}
      </ul>
    </div>
  );
};

export default GuestList;
