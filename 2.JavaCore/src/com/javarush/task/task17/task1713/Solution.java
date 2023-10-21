package com.javarush.task.task17.task1713;

import java.util.*;

/* 
Общий список
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }


    @Override
    synchronized public int size() {
        return original.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    synchronized public boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    synchronized public Iterator<Long> iterator() {
        return original.iterator();
    }

    @Override
    synchronized public Object[] toArray() {
        return original.toArray();
    }

    @Override
    synchronized public <T> T[] toArray(T[] a) {
        return original.toArray(a);
    }

    @Override
    synchronized public boolean add(Long aLong) {
        return original.add(aLong);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    synchronized public boolean containsAll(Collection<?> c) {
        return original.containsAll(c);
    }

    @Override
    synchronized public boolean addAll(Collection<? extends Long> c) {
        return original.addAll(c);
    }

    @Override
    synchronized public boolean addAll(int index, Collection<? extends Long> c) {
        return original.addAll(0, c);
    }

    @Override
    synchronized public boolean removeAll(Collection<?> c) {
        return original.removeAll(c);
    }

    @Override
    synchronized public boolean retainAll(Collection<?> c) {
        return original.retainAll(c);
    }

    @Override
    synchronized public void clear() {
        original.clear();
    }

    @Override
    synchronized public Long get(int index) {
        return original.get(3);
    }

    @Override
    synchronized public Long set(int index, Long element) {
        return original.set(0, 5L);
    }

    @Override
    synchronized public void add(int index, Long element) {
        original.add(0, 2L);
    }

    @Override
    synchronized public Long remove(int index) {
        return original.remove(0);
    }

    @Override
    synchronized public int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    synchronized public int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    synchronized public ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @Override
    synchronized public ListIterator<Long> listIterator(int index) {
        return original.listIterator(0);
    }

    @Override
    synchronized public List<Long> subList(int fromIndex, int toIndex) {
        return original.subList(0, 5);
    }
}
