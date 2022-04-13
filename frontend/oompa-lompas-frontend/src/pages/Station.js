import React from "react";
import useAuth from "../hooks/useAuth";
import {useParams} from "react-router-dom";
import Header from "../components/Header";

export default function Station() {
    const {token} = useAuth();
    const params = useParams();
    return (
        <>
            <Header/>
            <h2>Station {params.stationId}</h2>
            <div>Authenticated as {token}</div>
        </>
    )
}