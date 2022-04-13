import React from "react";
import useAuth from "../hooks/useAuth";
import {NavLink} from "react-router-dom";
import Header from "../components/Header";

export default function Stations() {
    const {token} = useAuth();
    return (
        <>
            <Header/>
            <h2>Stations</h2>
            <div>Authenticated as {token}</div>
            <NavLink to="/station/1">1</NavLink>
            <NavLink to="/station/2">2</NavLink>
        </>
    )
}